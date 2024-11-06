import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {
        //题目1
        topic1(1,1);

        //题目2
        topic2(1,1,1);

        //题目3
        topic3(1,1,10);

        //题目4
        topic4(1,1,10);
    }

    //题目1
    public static void topic1(Integer appleNum,Integer strawberryNum){
        if(appleNum<0){
            appleNum=0;
        }
        if(strawberryNum<0){
            strawberryNum=0;
        }
        System.out.println("题目1商品总价："+(apple(appleNum,8.0)+strawberry(strawberryNum,13.0))+"元");
    }

    //题目2
    public static void topic2(Integer appleNum,Integer strawberryNum,Integer mangoNum){
        if(appleNum<0){
            appleNum=0;
        }
        if(strawberryNum<0){
            strawberryNum=0;
        }
        if(mangoNum<0){
            mangoNum=0;
        }
        System.out.println("题目2商品总价："+(apple(appleNum,8.0)+strawberry(strawberryNum,13.0)+mango(mangoNum,20.0))+"元");
    }

    //题目3
    public static void topic3(Integer appleNum,Integer strawberryNum,Integer mangoNum){
        if(appleNum<0){
            appleNum=0;
        }
        if(strawberryNum<0){
            strawberryNum=0;
        }
        if(mangoNum<0){
            mangoNum=0;
        }
        System.out.println("题目3商品总价："+(apple(appleNum,8.0)+strawberry(strawberryNum,13.0*0.8)+mango(mangoNum,20.0))+"元");
    }

    //题目4
    public static void topic4(Integer appleNum,Integer strawberryNum,Integer mangoNum){
        if(appleNum<0){
            appleNum=0;
        }
        if(strawberryNum<0){
            strawberryNum=0;
        }
        if(mangoNum<0){
            mangoNum=0;
        }
        double price = apple(appleNum, 8.0) + strawberry(strawberryNum, 13.0*0.8) + mango(mangoNum, 20.0);
        if(price>=100){
            price = price - 10;
        }
        System.out.println("题目4商品总价："+price+"元");
    }




    //苹果
    public static Double apple(Integer num,Double price){
        return Double.valueOf(price*num);
    }

    //草莓
    public static Double strawberry(Integer num,Double price){
        return Double.valueOf(price*num);
    }

    //芒果
    public static Double mango(Integer num,Double price){
        return Double.valueOf(price*num);
    }
}
