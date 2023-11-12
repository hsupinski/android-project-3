package com.example.todo_project;

import androidx.fragment.app.Fragment;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        UUID taskID = (UUID)getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID);
        return TaskFragment.newInstance(taskID);
    }
}