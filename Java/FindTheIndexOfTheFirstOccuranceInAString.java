class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.equals(needle))
        {
            return 0;
        }



        if(haystack.length() > 1)
        {
            if(needle.length() > 1)
            {
                for(int i = 0; i <= haystack.length() - needle.length();i++)
                {
                    System.out.println(haystack.substring(i, i + needle.length()));
                    if(haystack.substring(i, i + needle.length()).equals(needle))
                    
                    {
                        return i;
                    }
                } 
            }
            else
            {
                String[] temp = haystack.split("");
                
                int counter = 0;
                for(String c: temp)
                {
                    if(c.equals(needle))
                    {
                        return counter;
                    }
                    else
                    {
                        counter++;
                    }
                }
            }
           
        }
        else
        {
            if(haystack.charAt(0) == needle.charAt(0))
            {
                return 0;
            }
        }
        


        return -1;
    }
}
