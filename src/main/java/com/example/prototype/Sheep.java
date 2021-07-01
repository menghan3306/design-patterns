package com.example.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @author liubin
 * @date 2021-03-29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sheep implements Cloneable,Serializable{

    private String name;

    private Integer age;

    private Integer[] infos;

    /**
     * 浅拷贝
     * @return copy
     */
    @Override
    protected Sheep clone() {
        Sheep sheep = new Sheep();
        try {
            sheep = (Sheep) super.clone();
            infos = infos.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    /**
     * 深拷贝
     * @return copy
     */
    public Sheep deepClone() {
        Sheep copy = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copy = (Sheep) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert (bos != null)&&(oos != null)&&(bis != null)&&(ois != null);
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return copy;

    }
}
