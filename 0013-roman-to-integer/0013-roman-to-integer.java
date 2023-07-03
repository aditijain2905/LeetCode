class Solution {
    public int romanToInt(String s) {
            
            int sum=0;
            int n = s.length();
            int[] num = new int[n];
            for (int i=0;i<n;i++)
            {
                switch (s.charAt(i)){
                    case 'I' :
                     num[i] =1 ;
                     break;

                     case 'V' :
                      num[i]=5 ;
                     break;

                      case 'X' :
                      num[i]=10 ;
                     break;

                      case 'L' :
                      num[i]=50 ;
                     break;

                      case 'C' :
                      num[i]=100 ;
                     break;

                      case 'D' :
                      num[i]=500 ;
                     break;

                      case 'M' :
                      num[i]=1000 ;
                     break;
                     }
                      }


            for(int i=0;i<n-1;i++)
            {
                if(num[i]<num[i+1])
                {
                   sum = sum -num[i];
                }
                else if(num[i]>=num[i+1])
                {
                    sum = sum+num[i];
                }
            }
            return sum+num[n-1];

            }

    }
    