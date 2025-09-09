package edu.io.pack4.Run;

import edu.io.pack4.Service.FileWrtieService;

public class FileWrtieRun {
    public static void main(String[] args) {
        FileWrtieService fws = new FileWrtieService();
       // fws.고전방식();
        fws.현대방식();
    }
}
