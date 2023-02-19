package Recursion;

public class Print_N_bit_binary_numbers_having_more_ones_than_zeroes_for_any_prefix {
    public static void main(String[] args) {
        nbit_Bnumber("",0,0,3);

    }
    static void nbit_Bnumber(String e,int o,int z,int n ){
        if(n==0){
            System.out.println(e);
            return;
        }
            nbit_Bnumber(e + "1", o + 1, z, n - 1);

        if(z==o){                           //zero is only included when its count is equal to one
            nbit_Bnumber(e+"0",o,z+1,n-1);
        }
    }
}
