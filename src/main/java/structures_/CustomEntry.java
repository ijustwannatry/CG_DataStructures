package structures_;

public class CustomEntry {

    private String key;
    private Integer data;

    public CustomEntry(String key, Integer data) {
        this.key = key;
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
