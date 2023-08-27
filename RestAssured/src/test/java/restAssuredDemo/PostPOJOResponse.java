package restAssuredDemo;

public class PostPOJOResponse {
    private String description;
    private Integer id;
    private String name;

//    public PostPOJOResponse(String description, Integer id, String name) {
//        this.description = description;
//        this.id = id;
//        this.name = name;
//    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
