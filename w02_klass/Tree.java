public class Tree {
    private int age;
    private int height;
    TreeWidth width;
    TreeType treeType;    


public Tree(int age, int height, TreeWidth width, TreeType treeType){
    this.age = age;
    this.height = height;
    this.width = width;
    this.treeType = treeType;
}

public int GetAge() {
    return age;
}

public int GetHeight() {
    return height;
}

public String getWidth(){
    if(width == TreeWidth.PEENIKE){
        return "Peenike";
    }
    else if(width == TreeWidth.KESKMINE){
        return "Keskmine";
    }
    else{
        return "Jäme";
    }
}

public String getType(){
    if(treeType == TreeType.OKASPUU){
        return "okaspuu";
    }else{
        return "lehtpuu";
    }
}

public void TreeYear(){
    if(treeType == TreeType.OKASPUU){
        System.out.println("Alati okastega");
    }else if(treeType == TreeType.LEHTPUU){
        System.out.println("Talvel raagus");
    }
}



}