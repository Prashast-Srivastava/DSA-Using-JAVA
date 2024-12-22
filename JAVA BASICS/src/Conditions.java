public class Conditions {
    public static void main(String[] args) {
        int salary = 240000;
        // if(salary>200000){
        //     salary += 2000;
        // }else{
        //     salary += 1000;
        // }
        if (salary>200000){
            if(salary<300000){
                salary += 3000;
            }else if(salary>200000){
                salary += 1000;
            }else{
                salary += 200000;
            }
        }

        System.out.println(salary);
    }
}
