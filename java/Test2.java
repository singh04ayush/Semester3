

class Ground{

    Ground(){
        System.out.println("in Ground class");
    }

    void toplay(){
        System.out.println("Lets play game");
    }

    boolean inGround(){
        System.out.println("Depends on type");
        return false;
    }
}

class Cricket extends Ground{

    Cricket(){
        System.out.println("in cricket class");
    }

    @Override
    void toplay(){
        System.out.println("Lets play cricket");
    }
    boolean inGround(){
        return true;
    }
}

class Gully extends Cricket{

    Gully(){
        System.out.println("in gully class");
    }

    @Override
    void toplay(){
        System.out.println("Lets play gully cricket");
    }
    boolean inGround(){
        return false;
    }
}


class Test2 {
    public static void main(String[] args) {
        Gully g1 = new Gully();

    }    
}
