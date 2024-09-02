/*
 * There are n students in a class numbered from 0 to n - 1. 
 * The teacher will give each student a problem starting with the student number 0, 
 * then the student number 1, and so on until the teacher reaches the student number n - 1.
 *  After that, the teacher will restart the process, starting with the student number 0 again.

You are given a 0-indexed integer array chalk and an integer k. 
There are initially k pieces of chalk. 
When the student number i is given a problem to solve, they will use chalk[i] pieces of chalk to solve that problem.
 However, if the current number of chalk pieces is strictly less than chalk[i], 
 then the student number i will be asked to replace the chalk.

Return the index of the student that will replace the chalk pieces.
 */
public class StudentReplaceChalkLC {
    public static int chalkReplacer(int[] chalk, int k) {
        int i=0;
        while(k>chalk[i]){
            if(i==chalk.length){
                i=0;
            }
            k=k-chalk[i];
            i++;
             if(i==chalk.length){
                i=0;
            }
        }
        if(i==chalk.length){
            return 0;
        }else if(k==chalk[i]){
            i++;
            if(i==chalk.length){
                i=0;
            }
            return i;
        }
        else{
            return i;
        }
    }
    public static void main(String[] args) {
        int chalk[] = {5,1,5};
        int k = 22;
        System.out.println(chalkReplacer(chalk,k));
    }
}
