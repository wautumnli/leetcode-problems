#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    string minNumber(vector<int> &nums) {
        vector<string> strs;
        for (int num: nums) {
            strs.push_back(to_string(num));
        }
        quickSort(strs, 0, strs.size() - 1);
        string res;
        for (const string& s: strs) {
            res.append(s);
        }
        return res;
    }

private:
    void quickSort(vector<string> &strs, int l, int r) {
        if (l >= r) {
            return;
        }
        int i = l, j = r;
        while (i < j) {
            while (strs[j] + strs[l] >= strs[l] + strs[j] && i < j) j--;
            while (strs[i] + strs[l] <= strs[l] + strs[i] && i < j) i++;
            swap(strs[i], strs[j]);
        }
        swap(strs[i], strs[l]);
        quickSort(strs, l, i - 1);
        quickSort(strs, i + 1, r);
    }
};