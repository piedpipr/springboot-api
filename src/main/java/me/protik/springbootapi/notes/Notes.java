package me.protik.springbootapi.notes;

public class Notes {
    private String id;
    private String name;
    private String body;

    public Notes() {
    }

    public Notes(String id, String name, String body) {
        this.id = id;
        this.name = name;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
