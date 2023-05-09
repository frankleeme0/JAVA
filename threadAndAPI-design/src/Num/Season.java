package Num;

public enum Season {
    SPRING("春"){
        @Override
        public void show() {

        }
    },SUMMER("夏"){
        @Override
        public void show() {

        }
    },AUTUMN(){
        @Override
        public void show() {

        }
    },WINTER(){
        @Override
        public void show() {

        }
    };
    public String name;
    private  Season(){}
    private Season(String name){
        this.name=name;
    }
    public abstract void  show();
}
