	• String templates (Preview)
		○ New class STR
			§ Eg: STR."Product with id \{ product.productId }"
		○ New class FMT (to format decimal places)
			§ Eg: FMT."Product with price %.2f\{ product.price}"
	• Sequenced Collection
		○ New interface added beneath Collection
		○ New methods -> addFirst, addLast, getFirst, getLast, removeFirst, removeLast, reversed
		○ Few collections won't support this eg: TreeSet
	• Unnamed classes and instance main methods (Preview)
		○ Can ignore the package, class name, main method args and static type
			§ public void main(){}
	• Unnamed Patterns & Variables (Preview)
		○ Replace unused patterns & variables to _ (underscore)
	• Record Patterns
		○ Java 11
			§ If(item instanceOf FoodItem)
			§ Var foodItem = (FoodItem) item;
			§ foodItem.name;
		○ Java 16 
			§ If(item instanceOf FoodItem foodItem);
			§ foodItem.name;
		○ Java 21
			§ If(item instanceOf FoodItem(var name, var price))
			§ name;
	• Pattern matching for switch
		○ Type pattern -> type of an object
		○ Guarded pattern -> additional checks
		○ Parenthesized pattern -> group the conditions
	• Virtual thread
		○ A platform thread is implemented as a thin wrapper around an operating system (OS) thread. A platform thread runs Java code on its underlying OS thread, and the platform thread captures its OS thread for the platform thread's entire lifetime.
		○ Virtual threads isn't tied to OS threads. A virtual thread still runs code on an OS thread. However, when code running in a virtual thread calls a blocking I/O operation, the Java runtime suspends the virtual thread until it can be resumed. The OS thread associated with the suspended virtual thread is now free to perform operations for other virtual threads.
	• Generation ZGC 
		○ Garbage collectors remove unused objects
		○ ZGC prioritizes latency (Java 15)
		○ Generational ZGC improves memory & CPU usage
		○ To use: java -XX:+UseZGC -XX:+Zgenerational
		○ Plan is to make it default
		○ How Garbage collection works? When you create an object in your application, a reference to the object is created on the heap, and the object in the application knows how to reach the reference for it on the heap. When references on the heap aren't reachable by any of the objects in the application, it means they're not being used anymore and they're just taking up space. The garbage collector removes these unused ones. One problem is that the objects that are left are lying all over the place, and they're not really making efficient use of the space on the heap.
		○ So the ZGC will move them into a less fragmented pattern. This means that the next time a new object is created and needs to be added to the heap, it's easier to find a place for it to fit. If the heap is really big, this can take a long time. So the ZGC does this while the application is running. It does this to prevent long pause times, which is what the ZGC is all about. But one problem with doing this at the same time is there might be lots of new objects being added to the application, and the ZGC might not be able to keep up with it and struggle to clear space in time.
This is the problem that the new generational parts aims to solve. The objects are divided into young and old generations. The theory is that most objects are short-lived and become unreachable soon after they're created. So the ZGC checks the young section for unused references more often. If a reference is still there after it's checked a few times, then this is a sign that is a long-lived object and doesn't need to be checked as much. So it gets moved to the old section, which isn't checked as often. This means that it's more likely the garbage collector can keep up with new objects being created because there's less references to scan. It's also more efficient and uses less CPU. So this is how the new generational aspect of ZGC can help applications achieve high latency efficiently.