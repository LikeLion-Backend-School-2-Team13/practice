public class MethodEx {
    private String name;
    private int age;

    public MethodEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String print(){
        String str = "안녕하세요 " +this.name +" "+ this.age +"세 입니다.";
        return str;
    }
    public static void main(String[] args) {
        MethodEx methodEx = new MethodEx("sdfdsv",153);
        System.out.println(methodEx.print());

    }

}
