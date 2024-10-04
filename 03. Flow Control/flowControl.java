class flowControl {
    public static void main(String[] args){
        int count = 50;
        /* 1. if statement */
        if(count < 30){
            System.out.println("count is lt 30");
        }else if(count >= 30 && count < 50){
            System.out.println("count is gte 30 and lt 50");
        }else{
            System.out.println("count is gte 50");
        }

        /* 2. switch statement */
        char letter = 'a';
        switch(letter){
            case 'a':
                System.out.println("letter is a");
                break;
            case 'b':
                System.out.println("letter is b");
                break;
            case 'c':
                System.out.println("letter is c");
                break;
            default:
                System.out.println("letter is not a, b, c");
                break;
        }

        /* 3. for loop */
        for(int i = 0; i < 5; i ++){
            System.out.println("For Loop: " + (i+1) + " times");
        }

        /* 4. while loop */
        int index = 0;
        while( index < 5 ){
            System.out.println("While Loop Index: " + index);
            index = index + 1;
        }
        index = 0;
        do{
            System.out.println("Do-While Loop Index: " + index);
            index = index + 1;
        }while( index < 5 );
    }
}
