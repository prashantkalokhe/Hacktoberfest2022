'''A person is again playing with numbers.

He defines the rating of a number as the count of trailing zeros in the product of all the digits of the number.

Chef wants you to find the sum of ratings of all the numbers between the numbers AA and BB (excluding AA). As the answer can be very large, print it modulo 10^9+710 
9 + 7.

'''


x,y=map(int,input().split())
z=y-x+1
b=[]
rem=1
final_ans=0
for i in range(x+1,x+z):
    b.append(i)
for i in range(0,len(b)):
    product=1
    z=0
    while b[i]!=0:
        rem=b[i] % 10
        product=product*rem
        b[i] = b[i] // 10
    converted_product=str(product)
    if(len(converted_product)==1):
        if(converted_product=='0'):
            z=z+1
        else:
            continue
    else:
        a=len(converted_product)-len(converted_product.rstrip("0"))
        z=z+a
    final_ans=final_ans+z

print(final_ans%((10**9)+7))