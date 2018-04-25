package au.com.maxcheung.challenges.q1.solvemefirst;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import au.com.maxcheung.challenges.q3.solvemefirst.PageData;

public class ExceptionHandling {

    private int page;  
    private int total;  
    private List<PageData> data ;
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public List<PageData> getData() {
        return data;
    }
    public void setData(List<PageData> data) {
        this.data = data;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

 
    
}
