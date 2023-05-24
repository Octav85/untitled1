package com.octavian.gitworkflow;

public class GitWorkflow {
    public static void main(String[] args) {
        String step1 = "perform git stash - to store uncommitted changes" ;
        String step2 = "perform git checkout master - to move to the local master branch" ;
        String step3 = "perform fetch command - to fetch the origin branches" ;
        String step4 = "perform git checkout -b new_branch_name to create and to move to a new branch" ;
        String step5 = "add your changes related to the task" ;
        String step6 = "review the changes and check the code before to commit them" ;
        String step7 = "execute git commit using interface, where you can select the changes that you want to commit" ;
        String step8 = "Once the changes are committed, execute git push command" ;
        String step9 = "The committed are pushed to origin branch with the same name" ;
        String step10 = "changed" ;

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);


    }
}
