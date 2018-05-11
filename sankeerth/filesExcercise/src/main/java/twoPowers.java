public class twoPowers {

public static void main(String[] args){
    isTwoPowerN(6);
}

private static void istwoPowern(int n){
    if(n ==1){
        System.out.println("yes");
        return;
    }
    int reminder = n % 2;
    int q = n /2;
    if(q >=1 && reminder ==0) {
        istwoPowern(q);
    }else if(reminder != 0){
        System.out.println("no");
    }
}

private static void isTwoPowerN(int n){
    int x = n & (n - 1);
    if(x == 0){
        System.out.println("yes");
        return;
    }
    System.out.println("no");
}


}
