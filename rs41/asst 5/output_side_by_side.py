# Simple Bubble Sort vs Selection Sort - Table Format

def bubble_sort(arr):
    result = arr.copy()
    n = len(result)
    for i in range(n):
        for j in range(0, n-i-1):
            if result[j] > result[j+1]:
                result[j], result[j+1] = result[j+1], result[j]
    return result

def selection_sort(arr):
    result = arr.copy()
    n = len(result)
    for i in range(n):
        min_idx = i
        for j in range(i+1, n):
            if result[j] < result[min_idx]:
                min_idx = j
        result[i], result[min_idx] = result[min_idx], result[i]
    return result

# Test arrays
arr =  [64, 34, 25, 12]



# Table header

print("           BUBBLE SORT vs SELECTION SORT - SIDE BY SIDE")

print(f"{'Original Array':<25} {'Bubble Sort':<20} {'Selection Sort':<20}")


# Process each test case
bubble_result = bubble_sort(arr)
selection_result = selection_sort(arr)
    
print(f" {str(arr):<25} {str(bubble_result):<20} {str(selection_result):<20}")

print("-" * 80)
