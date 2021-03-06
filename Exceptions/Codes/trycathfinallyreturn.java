class trycatchfinallyreturn
{
    /*
     * If return statement present try, catch and finally blocks then finally block
     * return statement will be considered.
     */
    public static void main(String[] args) {
        System.out.println(m1());
    }
    static String m1()
    {
        try {
            int a=90/0;
            return "From try";
        }
        catch (Exception err) {
            System.out.println(err.getStackTrace());
            return "return from catch";
        }
        finally{
            return "return from finally";
        }
        
    }
}