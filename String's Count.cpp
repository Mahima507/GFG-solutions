long long int countStr(long long int n){
    //complete the function here

	    // all a       --> 1
	    // 1b and a    --> n
	    // 1c and a    --> n
	    // 2c and a    --> n*(n-1)/2
	    // 1b,1c and a --> n*(n-1)
	    // 1b,2c and a --> n(n-1)(n-2)/2


	    return  1+ 2*n + n*(n-1)/2 + n*(n-1) + n*(n-1)*(n-2)/2;
}
