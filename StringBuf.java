class StringBuf
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("Hashcode of sb: "+sb.hashCode());
        System.out.println("capacity of sb: "+sb.capacity());
        System.out.println("sb: "+sb);
        sb.append(" hi");
        System.out.println("sb after appending hi: "+sb);
        System.out.println("capacity of sb after append: "+sb.capacity());
        String str=sb.toString();
        System.out.println("Convered String: "+str);
        sb.insert(sb.length(),1);
        System.out.println("sb after insertion: "+sb);
        sb.delete(1,3);
        System.out.println("sb after deletion after a substring: "+sb);
        sb.deleteCharAt(sb.length()-1);
        System.out.println("sb after deletion the last char: "+sb);
        System.out.println("Hashcode of sb: "+sb.hashCode());

    }    
}
