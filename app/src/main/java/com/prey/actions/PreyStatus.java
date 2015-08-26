package com.prey.actions;

/**
 * Created by oso on 25-08-15.
 */
public class PreyStatus {

    private static PreyStatus instance=null;

    private PreyStatus(){

    }

    public static PreyStatus getInstance(){
        if (instance==null){
            instance=new PreyStatus();
        }
        return instance;
    }

    private boolean isTakenPicture=false;

    public boolean isTakenPicture() {
        return isTakenPicture;
    }

    public void setTakenPicture(boolean isTakenPicture) {
        this.isTakenPicture = isTakenPicture;
    }

}
