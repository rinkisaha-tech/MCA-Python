# Question 6: Simple Selection Sort

def selection_sort(arr):
    n = len(arr)
    
    for i in range(n):
        # Find minimum element index
        min_idx = i
        for j in range(i + 1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        
        # Swap minimum with first element
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
        print(f"Step {i+1}: {arr}")
    
    return arr

# Test the function
test_array = [6, 3, 5, 2, 4, 1]
print(f"Original: {test_array}")
print("Selection Sort Process:")
result = selection_sort(test_array.copy())
print(f"Final: {result}")