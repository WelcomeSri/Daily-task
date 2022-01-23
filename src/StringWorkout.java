
public class StringWorkout{
	
	    public static void main(String [] args){
//	        String str = "welcome to java and selenium";
//	        String s1=" ";
//	        String [] s2=str.split(" ");
//	        for(String s3:s2){
//	            String reverseWord="";
//	            for(int i=s3.length()-1;i>=0;i--){
//	            reverseWord=reverseWord+s3.charAt(i);
//
//	        }
//	        s1=s1+reverseWord+" ";
//	        }
//	        System.out.println(s1);  
//	    }
	  
//	
//	   String s1 = "welcome to java";
//	   String stringupperCase=" ";
//       String [] s2=s1.split(" ");
//       for(String s3:s2){
//           
//       char ch= s3.charAt(0);
//       char a = Character.toUpperCase(ch);
//           String b = s3.substring(1);
//           stringupperCase=stringupperCase+a+b+" ";
//           
//       }
//       System.out.println(stringupperCase);
	    	
	    	
	    	        
	    
//	    		   String s="weLcome#2233";
//	    		   String uc="",lc="",d="",p="";
//	    		   for(int i=s.length()-1;i>=0;i--){
//	    			   
//	    		           
//	    			char c  =s.charAt(i);
//	                String bb   = s.replace("m", "@");
//	                System.out.println(bb);
//	    			
//	    			if(Character.isUpperCase(c)) {
//	    				
//	    				uc=uc+c;
//	    			}
//	    			else if (Character.isLowerCase(c)) {
//						 lc=lc+c;
//					}
//	    			else if (Character.isDigit(c)) {
//						d=d+c;
//					}
//	    			else {
//	    				 p=p+c;
//	    			}
//	    		    
//	    		   }
//	    		   System.out.println("uppercase="+uc);
//	    		   System.out.println("lowercase="+lc);
//	    		   System.out.println("digit="+d);
//	    		   System.out.println("sim="+p);
//	    }

	   
//	    	    int a=35793579;
//	    	    int count=0;
//	    	   while(a>0){
//
//	    	        count++;
//	    	        a/=10;
//	    	}
//	    	  System.out.println(count);
//	    	        	
//	    }
	    	
	    	
	    	

//	    		String s="SrikaranHaridoss123@Gmail.com";
//	    		int u=0,l=0,d=0,sp=0;
//	    		String uc="",lc="",dt="",spl="";
//	    		for(int i=0;i<s.length();i++){
//
//	    		char ss=s.charAt(i);
//
//	    		if(Character.isLowerCase(ss)){
//	    		l++;
//	    		lc=lc+ss;
//	    		}
//	    		else if(Character.isUpperCase(ss)){
//	    		u++;
//	    		uc=uc+ss;
//	    		}
//	    		else if(Character.isDigit(ss)){
//	    		d++;
//	    		dt=dt+ss;
//	    		}
//	    		else{
//	    		sp++;
//	    		spl=spl+ss;
//	    		}
//	    		}
//	    		System.out.println("lower="+l+lc);
//	    		System.out.println("upper="+u+uc);
//	    		System.out.println("digits="+d+dt);
//	    		System.out.println("spcial="+sp+spl);
//	    		}
//	    		}
//


	    	
	    	 int[] a=new int[5];
	         a[0]=200;
	         a[1]=400;
	         a[2]=600;
	         a[3]=800;
	         a[4]=1000;
	         for(int i=0;i<a.length;i++){
	       
	            for(int j=i+1;j<a.length;j++){
	                 if(a[i]<a[j]){
	                       int temp=a[i];
	                        a[i]=a[j];
	                        a[j]=temp;
	                  }
	               }
	            }
	               for(int i=0;i<a.length;i++){
	               System.out.println(a[i]);
	           }
	         }
	    }
	    	

	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	

