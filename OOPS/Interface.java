package OOPS;
//Multiple Inheritance
//Total Abstraction

import javax.sql.rowset.spi.SyncResolver;

public class Interface {
    
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down , left, right, diagonal");
    }
}