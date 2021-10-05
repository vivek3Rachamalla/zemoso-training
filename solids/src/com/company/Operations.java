package com.company;

public class Operations implements IOperations {
    private IDataBase DbObj;
    private Imessage message;

    public Operations(IDataBase dbObj, Imessage message) {
        DbObj = dbObj;
        this.message = message;
    }

    public IDataBase getDbObj() {
        return DbObj;
    }

    public void setDbObj(IDataBase dbObj) {
        DbObj = dbObj;
    }
    public Imessage getMessage() {
        return message;
    }

    public void setMessage(Imessage message) {
        this.message = message;
    }
}
