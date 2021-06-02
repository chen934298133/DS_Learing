package LeetCode_2021.Coding_2021_05_28.NettySingle;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;

public class HelloServer {
    public static void main(String[] args) {
        // 1. 启动器,负责组装 netty 组件，启动服务器
        new ServerBootstrap()
                // 2. NIO提到过(BossEventLoop、WorkerEventLoop)(selector,thread),group组
                .group(new NioEventLoopGroup())
                // 3. 选择服务器的 ServerSocketChannel 实现
                .channel(NioServerSocketChannel.class)
                // 4. boss 负责处理连接 worker(child) 负责处理读写，决定了worker(child) 能执行那些操作(hander)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    // 5. channel 代表和客户端进行数据读写的通道 Initializer 初始化
                    @Override
                    protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {
                        // 6. 添加具体 hander
                        // 将 byteBuf 转为字符串
                        nioSocketChannel.pipeline().addLast(new StringDecoder());
                        // 自定义handler
                        nioSocketChannel.pipeline().addLast(new ChannelInboundHandlerAdapter(){
                            @Override
                            public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//                                super.channelRead(ctx, msg);
                                // 7. 打印上一步转换好的字符串
                                System.out.println(msg);
                            }
                        });
                    }
                })
                //  绑定监听端口
                .bind(6668);
    }
}
