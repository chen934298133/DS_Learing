package LeetCode_2021.Coding_2021_03_17;

public class Record {
    private String id;
    private String temperature;
    private String mask_flag;
    private String capture_time;
    private String face_img_path;

    public Record(String id, String temperature, String mask_flag, String capture_time, String face_img_path) {
        this.id = id;
        this.temperature = temperature;
        this.mask_flag = mask_flag;
        this.capture_time = capture_time;
        this.face_img_path = face_img_path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getMask_flag() {
        return mask_flag;
    }

    public void setMask_flag(String mask_flag) {
        this.mask_flag = mask_flag;
    }

    public String getCapture_time() {
        return capture_time;
    }

    public void setCapture_time(String capture_time) {
        this.capture_time = capture_time;
    }

    public String getFace_img_path() {
        return face_img_path;
    }

    public void setFace_img_path(String face_img_path) {
        this.face_img_path = face_img_path;
    }
}
