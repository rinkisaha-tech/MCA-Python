u_imp = input("Enter the numbers: ")

list1 = list(map(int,u_imp.split()))
print("Unsorted list: ",list1)

n = len(list1)
for i in range(n):
    for j in range(0, n-i-1):
        if list1[j] > list1[j+1]:
            list1[j], list1[j+1] = list1[j+1], list1[j]


    print(list1)


//using function

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        swapped = False
        print(f"Start of iteration {i + 1}: {arr}")
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
                print(f"  Swapped elements at idx {j} and {j + 1}: {arr}")
        if not swapped:
            print("No swap needed, array already sorted.")
            break
        print(f"End of iteration {i + 1}: {arr}\n")
    return arr

def main():
    user_input = input("Enter numbers X Y: ")
    try:
        arr = list(map(int, user_input.strip().split()))
    except ValueError:
        print("Please enter valid integers only.")
        return

    print(f"Original array: {arr}")
    sorted_arr = bubble_sort(arr)
    print(f"Sorted array: {sorted_arr}")

if __name__ == "__main__":
    main()
