class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;


        while(child<g.length && cookie<s.length){
            if(s[cookie]>=g[child]){    // we check if child is greater or cookie is greater , we increment it accordingly 
                child++;  //  if child is more and cookie is less , and it increment cookie and it gives output where how many child is satisfied by current cookies 
            }
            cookie++;    // if child is less , and cookie is more so it will allot all cookies to child , it satisfies all child which are present in here 
        }return child;   // return the child counts which are satisfied with cookies
                 
    }
}

/*
Input
g =
[1,2,3]
s =
[1,1]
Output
1
*/
