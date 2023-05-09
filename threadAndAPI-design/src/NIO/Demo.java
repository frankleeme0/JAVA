package NIO;

import java.nio.ByteBuffer;

public class Demo {
    public static void main(String[] args) {
        ByteBuffer b=ByteBuffer.allocate(3);
        ByteBuffer bb=ByteBuffer.wrap(new byte[]{2,3,4});
        ByteBuffer bbb=ByteBuffer.wrap("aaa".getBytes());
        for (int i = 0; i < 3; i++) {
            System.out.println(bbb.get());
        }

        //System.out.println(b.get());

        System.out.println(bbb.position());
        System.out.println(bbb.limit());
        //bbb.put((byte) 97);溢出
        bbb.flip();
        bbb.clear();
        System.out.println(bbb.remaining());

    }
}
