public class simple{
    public static void main(String args[]){
int READ = 1;    // 0001
int WRITE = 2;   // 0010
int EXECUTE = 4; // 0100
int DELETE = 8;  // 1000

// Suppose a user has READ and EXECUTE permissions
int permissions = READ | EXECUTE;
System.out.println(permissions);
}
}
