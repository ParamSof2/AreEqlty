public class AreEqlty{
public static void main(String [] args){
int a[]={1,2,3,4,5,7};
int b[]={1,2,3,4,5};
int count=0;
if(a.length==b.length){
for(int i=0;i<a.length;i++){
if(a[i]==b[i]){
count++;
}
}
if(count==a.length){
System.out.println("a and b are --- Equal");
}
else{
System.out.println("a and b are not equal");
}
}
else{
System.out.println("a and b are not equal");
}

}
}