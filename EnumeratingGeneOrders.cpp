#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int nums [n];
    for(int i = 0; i < n; i++) {
        nums[i] = i + 1;
    }
    do {
        for(int i =0; i < n; i++) {
            cout << nums[i];
            cout << " ";
        }
        cout << "\n";
    }
    while (next_permutation(nums, nums + n));
}
