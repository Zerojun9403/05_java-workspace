package edu.oop.field.pack2;

import edu.oop.field.pack1.FildEx;

/* 다른 폴더 에 존재하는 클래스 파일을 호출 했기 때문에

   packge 아래 import edu.oop.field.pack1.FildEx;
   어디서 어떤 파일을 가지고 오는지 import로 작성
* */
public class FieldRun2 {

    public static void main(String[] args) {
        FildEx f1 = new FildEx();
        // 어디서든 접근 가능
        System.out.println(f1.publicValue);

        /* 같은패키지 + 상속을 받았을 경우에만 사용 가능
        public class FieldRun2 extends FieldEx 를 추가하면 FieldRun2 에서 protected 사용가능
        'protectedValue이(가) 'edu.oop.field.pack1.FildEx'에서 protected 액세스를 가집니다
        System.out.println(f1.protectedValue); */

        /*  같은 패키지 에서만 사용 가능
        'defaultValue이(가) 'edu.oop.field.pack1.FildEx'에서 public이 아닙니다.
         외부 패키지에서 액세스할 수 없습니다
        System.out.println(f1.defaultValue); */

        /* 같은 클래스에서만 사용 가능
          'privateValue이(가) 'edu.oop.field.pack1.FildEx'에서 private 액세스를 가집니다
          System.out.println(f1.privateValue); */



    }

}
