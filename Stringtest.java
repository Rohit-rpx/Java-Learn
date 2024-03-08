class Stringtest 
{
    public static void main(String args[])
    {
        String str="Hello   ";
        String str1=new String("10");
        System.out.println("charcter at index 0 of str: "+str.charAt(0));
        System.out.println(str.concat(str1));
        int a=Integer.parseInt(str1);
        System.out.println("Parsed integer: "+a);
        System.out.println("compareTo method: "+str.compareTo("hello"));
        System.out.println("compateToIgnoreCase:"+str.compareToIgnoreCase("Hello"));
        System.out.println("codePointAt 4:"+str.codePointAt(4));
        System.out.println("equalt to hello : "+str.equals("hello"));
        System.out.println("length of the string:"+str.length());
        System.out.println("trimmed string: "+str.trim());
        String str2="10";
        System.out.println("str1 hashcode:"+str1.hashCode()+"   str2 hashcode:"+str2.hashCode());
        System.out.println("Hashcode of str:"+str.hashCode());
        str=str+"Hello";
        System.out.println("concatenated string:"+str);
        System.out.println("Hashcode after Concat:"+str.hashCode());
    }    
}
