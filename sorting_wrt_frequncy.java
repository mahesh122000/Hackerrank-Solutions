static void sortByFreq(int arr[], int n)
    {
    ArrayList<Integer>al=new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    al.add(arr[i]);
    Arrays.sort(arr);
    int l=arr[n-1];
    int a[]=new int[l];
    for(int i=0;i<l;i++)
    a[i]=0;
    int count=0;
    for(int i=0;i<n;i++)
    {a[arr[i]-1]=Collections.frequency(al,arr[i]);
    if(a[arr[i]-1]>=1)
    count++;
    }
    int b[]=new int[count];
    int c[]=new int[count];
    for(int i=0;i<count;i++)
    b[i]=0;
    for(int i=0,j=0;i<count && j<l;j++)
    {if(a[j]>=1)
    {b[i]=j;c[i]=a[j];i++;}}
    for(int i=0;i<count-1;i++)
    {for(int j=0;j<count-i-1;j++)
    {if(c[j]<c[j+1])
    {int temp=c[j];
    c[j]=c[j+1];
    c[j+1]=temp;
    temp=b[j];
    b[j]=b[j+1];
    b[j+1]=temp;}
    else if(c[j]==c[j+1])
    {if(b[j]>b[j+1])
    {int temp=b[j];
    b[j]=b[j+1];
    b[j]=temp;}}}}
    int brr[]=new int[n];
    int j=0;
    for(int i=0;i<count;i++)
    {int p=c[i];
    while(p-->0)
    {brr[j]=b[i]+1;
    j++;}}
    for(int i=0;i<n;i++)
    System.out.print(brr[i]+" ");
}