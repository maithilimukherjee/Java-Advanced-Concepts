public abstract class Lang{
    public abstract void showLang();
}

class German extends Lang{
    public void showLang(){
        System.out.println("German");
    }
}

class Bengali extends Lang{
    public void showLang(){
        System.out.println("Bengali");
    }
}

class LangDemo{
    public static void main(String[] args) {
        Lang obj1 = new German();
        obj1.showLang();

        Lang obj2 = new Bengali();
        obj2.showLang();
    }
}