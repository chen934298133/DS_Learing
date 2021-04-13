package LeetCode_2021.Coding_2021_03_17;

import java.util.*;

public class Test_ListInMap {
    public static void main(String[] args){

        List<Record> list = new ArrayList<>();
        Record record1 = new Record("1", "36.0", "1", "100203", "D:/asdasd/da");
        Record record2 = new Record("2", "36.1", "0", "100203", "D:/asdasd/da");
        Record record3 = new Record("3", "36.2", "2", "100203", "D:/asdasd/da");
        Record record4 = new Record("4", "36.3", "1", "100203", "D:/asdasd/da");
        Record record5 = new Record("5", "36.4", "2", "100203", "D:/asdasd/da");
        Record record6 = new Record("6", "36.5", "0", "100203", "D:/asdasd/da");
        list.add(record1);
        list.add(record2);
        list.add(record3);
        list.add(record4);
        list.add(record5);
        list.add(record6);

        Test_ListInMap test = new Test_ListInMap();
        System.out.println(test.getRecords(list).entrySet());

        long nowTime = System.currentTimeMillis();
        long todayStartTime = nowTime - ((nowTime + TimeZone.getDefault().getRawOffset()) % (24 * 60 * 60 * 1000L));

        System.out.println(todayStartTime);
    }

    public Map<String, Object> getRecords(List<Record> list){
        Map<String, Object> result_map = new HashMap<>();
        Map<String, Object> result_map2 = null;
        List<Map<String, Object>> record_list = new ArrayList<>();
        Iterator<Record> iterator = list.iterator();
        while (iterator.hasNext()){
            result_map2 = new HashMap<>();
            Record resultSet = iterator.next();
            result_map2.put("编号_id", resultSet.getId());
            result_map2.put("体温_temperature", resultSet.getTemperature());
            result_map2.put("口罩状态_mask_flag", resultSet.getMask_flag());
            result_map2.put("通过时间_capture_time", resultSet.getCapture_time());
            result_map2.put("抓图_face_img_path", resultSet.getFace_img_path());
            record_list.add(result_map2);
        }
        result_map.put("record_list", record_list);
        return result_map;
    }
}
