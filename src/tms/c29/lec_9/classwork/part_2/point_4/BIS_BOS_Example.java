package tms.c29.lec_9.classwork.part_2.point_4;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.IOException;

public class BIS_BOS_Example {
    public static void main(String[] args) {
        byte[] bytes = new byte[100];

        try (ByteOutputStream bos = new ByteOutputStream();
             ByteInputStream bis = new ByteInputStream() {
             }) {
            String message = "Nice day";
            bos.write(message.getBytes());
            byte[] toByteArray = bos.toByteArray();
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
