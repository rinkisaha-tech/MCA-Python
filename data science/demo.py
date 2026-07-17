n = 10
arr = [[0] * n for _ in range(n)]

# top,left=0
# right,bottom=n-1
row_count=0
col_count=0
full_count=10
n=10
num=1
while(n!=0):
    for i in range(row_count,full_count):
        arr[row_count][i]=num
        num+=1
        col_count+=1
    row_count+=1
    col_count-=1
    full_count-=1

    # for i in range(row_count,col_count+1):
    #     arr[i][col_count]=num
    #     num+=1
    #     row_count+=1
    # col_count-=1
    # row_count-=1
    # row_count = col_count

    # for i in range(col_count,-1,-1):
    #     arr[row_count][i]=num
    #     num+=1
    #     col_count-=1
    # col_count+=1
    # row_count-=1
    # # # col_count+=1

    # for i in range(row_count,0,-1):
    #     arr[i][col_count]=num
    #     num+=1
        # col_count-=1
    # col_count+=1
    # row_count-=1
    # # col_count+=1


    n-=1                                                                                                                                                                                                                                                                             
# Print
print("Row: ",row_count)
print("col: ",col_count)
print("full: ",full_count)
for row in arr:
    for value in row:
        print(f"{value:4}", end="")
    print()
