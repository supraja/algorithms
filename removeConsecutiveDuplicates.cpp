
#include <iostream>
#include<string>
#include <stack>

using namespace std;

char* reverse(char* str) {
    
    if(strlen(str) == 0)
        return NULL;
    
    int len = strlen(str);
    int i = 0, j = len-1;
    
    while(i < j) {
        char tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
     i++;
     j--;
    }
    
    return str;
}

int main(int argc, char**argv) {
    
    stack<char> st;
    char* colors = new char[10];
    cin >> colors;
    
    int i = 0;
    while(colors[i] != '\0') {
    
        if(i < 1)
            st.push(colors[i]);
        else {
            if(!st.empty() && st.top() == colors[i])
                st.pop();
            else
                st.push(colors[i]);
        }
        i++;
    }
    
    cout << "After removing consecutive duplicates \n";
    char* new_str = new char[st.size()];
    i = 0;
    while(!st.empty()) {
        
        new_str[i] = st.top();
        st.pop();
        i++;
    }
    new_str = reverse(new_str);
    std::cout << new_str << "\n";
    
    return 0;
}

