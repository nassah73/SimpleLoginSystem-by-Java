 class User {
    private String name;
    private int id;
    private String email;

    public User(String name,int id,String email){
        this.name=name;
        this.id=id;
        this.email=email;

    }
    public String getName(){
        return name;
    }
    public int getid(){
        return id;
    }
    public String getEmail(){
        return email;
    }
}
