package com.coder.love;

public class Person {

    public String name;

    public boolean handsome;

    public boolean rich;

    public int love;

    public Person() {
        initLove();
    }

    public Person(String name, boolean handsome, boolean rich) {
        this.name = name;
        this.handsome = handsome;
        this.rich = rich;
        initLove();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHandsome() {
        return handsome;
    }

    public void setHandsome(boolean handsome) {
        this.handsome = handsome;
    }

    public boolean isRich() {
        return rich;
    }

    public void setRich(boolean rich) {
        this.rich = rich;
    }

    public int initLove() {
        if(this.love==0){
            this.love = (int)(1+Math.random()*(100-1+1)) ;
        }
        return love;
    }


    public boolean love(Person p){

        if(this.initLove()==p.initLove()){
            return true;
        }

        if(p.isHandsome()&&p.isRich()){
            return true;
        }

        if(!p.isHandsome()&&p.isRich()){
            if(love>50){
                return true;
            }
            return false;
        }

        if(p.isHandsome()&&!p.isRich()){
            if(love>50){
                return true;
            }
            return false;
        }

        return false;
    }


}
