package com.company;

public interface Create {
    public static IOperations getOperations(){
        Imessage obj1=getSendEmail();
        IDataBase obj2=getDatabase();
        return new Operations(obj2,obj1);
    }
    public static IClient getClient(){
        return new Client();
    }
    public static Imessage getSendEmail(){
        return new SendEmail();
    }
    public static IDataBase getDatabase(){
        return  new Db();
    }
    public static Vehicle getCar(){
        return  new Car();
    }
    public static Vehicle getBike(){
        return  new Bike();
    }
}
