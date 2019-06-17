package main

func main() {}

func twoSum(nums []int, target int) []int {

	x := make(map[int]int)
	for k, v := range nums {
		x[v] = k
	}

	for k, v := range nums {

		if val, ok := x[target-v]; ok && val != k {

			return []int{k, val}

		}

	}
	return []int{}
}
