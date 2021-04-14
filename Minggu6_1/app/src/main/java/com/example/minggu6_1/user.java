package com.example.intent;

import android.os.Parcel;
import android.os.Parcelable;

public class user implements Parcelable {

    private String name;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public user(String name, String email){
        this.name = name;

        this.email = email;


    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);

        dest.writeString(this.email);

    }



    protected user(Parcel in) {
        this.name = in.readString();

        this.email = in.readString();

    }

    public static final Parcelable.Creator<user> CREATOR = new Parcelable.Creator<user>() {
        @Override
        public user createFromParcel(Parcel source) {
            return new user(source);
        }

        @Override
        public user[] newArray(int size) {
            return new user[size];
        }
    };
}
