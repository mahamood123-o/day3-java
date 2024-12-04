class power
{
    public static void main(String args[]){
        int a=5;
        int pos=2;
        if((a&(1<<pos))!=0){
            System.out.println("setbit");
        }
        else
        {
            System.out.println("not setbit");
        }
    }
}