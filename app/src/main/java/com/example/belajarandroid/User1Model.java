package com.example.belajarandroid;

import android.os.Parcel;
import android.os.Parcelable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class User1Model implements Parcelable {

    private String Username;
    private String NoHp;
    private String TanggalLahir;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Username);
        dest.writeString(this.NoHp);
        dest.writeString(this.TanggalLahir);
    }

    public void readFromParcel(Parcel source) {
        this.Username = source.readString();
        this.NoHp = source.readString();
        this.TanggalLahir = source.readString();
    }

    protected User1Model(Parcel in) {
        this.Username = in.readString();
        this.NoHp = in.readString();
        this.TanggalLahir = in.readString();
    }

    public static final Parcelable.Creator<User1Model> CREATOR = new Parcelable.Creator<User1Model>() {
        @Override
        public User1Model createFromParcel(Parcel source) {
            return new User1Model(source);
        }

        @Override
        public User1Model[] newArray(int size) {
            return new User1Model[size];
        }
    };
}
