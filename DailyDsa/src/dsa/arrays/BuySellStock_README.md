# Best Time to Buy and Sell Stock (Single Transaction)

This problem finds the **maximum profit** that can be achieved from a list of stock prices by making **only one buy and one sell**, where the buy must happen **before** the sell.

---

## 📌 Problem Statement

You are given an integer array `prices` where:

- `prices[i]` represents the stock price on day `i`
- You are allowed to **buy once** and **sell once**
- Return the **maximum profit**
- If no profit is possible, return `0`

---

## ✅ Approach (Optimized – O(n))

Instead of checking all buy–sell combinations (which takes O(n²) time), we:

1. Track the **minimum price seen so far** (best day to buy)
2. For each day, calculate the profit if we sell on that day
3. Update the maximum profit whenever a better profit is found

---

## 💻 Java Code

```java
public static int maxProfitSolution2(int[] prices){
    int minSoFar = Integer.MAX_VALUE;
    int profit = 0;

    for (int price : prices) {
        if (price < minSoFar) {
            minSoFar = price;
        } else {
            int gain = price - minSoFar;
            if (gain > profit) {
                profit = gain;
            }
        }
    }
    return profit;
}
```

---

## 🔍 Variable Explanation

| Variable | Description |
|--------|-------------|
| `minSoFar` | Minimum stock price encountered so far (best buying price) |
| `profit` | Maximum profit calculated so far |
| `price` | Current day’s stock price during iteration |
| `gain` | Profit if the stock is sold on the current day |

---

## 🧪 Dry Run Example

### 📥 Input

```text
prices = [7, 1, 5, 3, 6, 4]
```

### 🔁 Step-by-Step Execution

| Day | Price | Min So Far | Action Taken | Gain | Max Profit |
|----|-------|------------|--------------|------|------------|
| 1 | 7 | 7 | Set initial buy price | – | 0 |
| 2 | 1 | 1 | Found better buy price | – | 0 |
| 3 | 5 | 1 | Sell | 4 | 4 |
| 4 | 3 | 1 | Sell | 2 | 4 |
| 5 | 6 | 1 | Sell | 5 | 5 |
| 6 | 4 | 1 | Sell | 3 | 5 |

### ✅ Output

```text
5
```

✔ Buy at price `1`  
✔ Sell at price `6`  
✔ Maximum Profit = `5`

---

## 🚫 Edge Case: Decreasing Prices

### 📥 Input

```text
prices = [7, 6, 4, 3, 1]
```

### 📤 Output

```text
0
```

**Reason:** Prices keep decreasing, so no profitable transaction is possible.

---

## ⏱️ Complexity Analysis

| Metric | Complexity |
|------|-----------|
| Time | `O(n)` |
| Space | `O(1)` |

---

## 🎯 Interview One-Liner

> **“Track the minimum price so far as the buying point and calculate the maximum profit by attempting to sell on each day.”**

---

## 📚 Related Topics

- Arrays
- Greedy Algorithms
- Sliding Window Pattern
